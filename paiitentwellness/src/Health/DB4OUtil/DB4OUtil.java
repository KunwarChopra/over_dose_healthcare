package Health.DB4OUtil;

import Health.ConfigSystem;
import Health.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;


/**
 *
 * @author saura
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();//data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {


EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
config.common().add(new TransparentPersistenceSupport());
//Control number of objects in memory
config.common().activationDepth(Integer.MAX_VALUE);
//Controls level of update of Object
config.common().updateDepth(Integer.MAX_VALUE);

//Register your top most Class here
config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object to save


return db;
} catch (Exception ex) {
System.out.print(ex.getMessage());
}
return null;
    }

    public synchronized void storeSystem(Ecosystem system) {
      ObjectContainer conn = createConnection();
conn.store(system);
conn.commit();
conn.close();
    }
    
    public Ecosystem retrieveSystem(){
        ObjectContainer conn = createConnection();
ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class); // Change to the object you want to save
Ecosystem system;
if (systems.isEmpty()) {
system = ConfigSystem.configure(); // If there's no System in the record, create a new one
} else {
system = systems.get(systems.size() - 1);
}
conn.close();
return system;
}
}
