# Basics

---

## Time Slicing

### What is Time Slicing?

- Time Slicing is a technique used by the operating system to allocate CPU time to multiple processes or threads.

- It involves dividing the CPU time into small time slices and assigning each process or thread a time slice to execute.

- This allows multiple processes or threads to share the CPU and gives the illusion of simultaneous execution.

### How does Time Slicing work?

- The operating system maintains a list of all processes and threads that are ready to run.

- It uses a timer interrupt to switch between processes or threads at regular intervals.

- When a process or thread's time slice expires, the operating system saves its state and switches to the next process or thread in the list.

- This process is known as context switching.

### Benefits of Time Slicing

- Fairness: Time Slicing ensures that all processes and threads get a fair share of CPU time.

- Responsiveness: Time Slicing allows the operating system to quickly respond to user input and other events.

- Resource Utilization: Time Slicing helps to maximize CPU utilization by keeping it busy with multiple processes or threads.

### Challenges of Time Slicing

- Overhead: Context switching introduces overhead, as the operating system must save and restore the state of each process or thread.

- Latency: Time Slicing can introduce latency, as processes or threads may have to wait for their turn to execute.

- Complexity: Time Slicing adds complexity to the operating system, as it must manage the scheduling and context switching of multiple processes or threads.

- Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.
