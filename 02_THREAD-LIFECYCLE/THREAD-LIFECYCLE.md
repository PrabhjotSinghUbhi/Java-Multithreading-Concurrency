# Thread Lifecycle

---

## Thread Lifecycle Overview

### What is a Thread Lifecycle?

- The thread lifecycle refers to the various states a thread can be in during its existence, from creation to termination.

### Thread States

1. **New**: The thread is created but not yet started.
2. **Runnable**: The thread is ready to run and waiting for CPU time.
3. **Blocked**: The thread is waiting for a resource (e.g., I/O) to become available.
4. **Waiting**: The thread is waiting for another thread to perform a particular action.
5. **Terminated**: The thread has completed its execution.

### Thread State Transitions

![Thread Lifecycle Diagram](./Thread%20Lifecycle%20-%20visual%20selection.png)
