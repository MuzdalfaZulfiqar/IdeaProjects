public class oop_Thread_LifeCycle {
    public static void main(String[] args) {
        // Stage-1 New---> means only the instance of the thread is created but has not started yet
        // By invoking the start() method

        // Stage-2 Runnable---> After invoking the start() method , the thread scheduler can choose it
        // to execute it

        // Stage-3 Running---> After the thread scheduler has selected the thread it is in running stage now

        // Stage-4 Non-Runnable---> When a thread takes time to execute, the thread scheduler will carry on
        // other threads and declare this as non-Runnable
        // It can be in runnable stage again and the thread scheduler will choose it sometime

        // Stage-5 Terminated--> When no line of thread which has not been executed remains, thread is
        // called terminated
        }
}
