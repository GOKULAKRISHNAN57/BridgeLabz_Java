package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

// Custom class implementing AutoCloseable to ensure structured execution cleanup
class DatabaseConnection implements AutoCloseable {
    
    public void executeQuery() throws Exception {
        System.out.println("Executing database operation...");
        throw new Exception("Database network dropped unexpectedly.");
    }

    @Override
    public void close() {
        // This execution loop triggers automatically under a Try-With-Resources lifecycle
        System.out.println("Cleanup Action: Database connection explicitly closed safely.");
    }
}

public class ResourceCleanupProblem {
    public static void main(String[] args) {
        
        try (DatabaseConnection connection = new DatabaseConnection()) {
            connection.executeQuery();
        } catch (Exception e) {
            // Handles execution exception after the connection resource has run its close() cleanup routine
            System.out.println("Caught execution failure: " + e.getMessage());
        }
    }
}