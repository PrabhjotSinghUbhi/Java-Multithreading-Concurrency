# Basics

---

## Multi-Tasking

### What is a Multi-Tasking?

- Multi-tasking allows an operating system to run multiple processes simultaneously.

### How does multi-tasking work in a single core processor?

- A single core processor can only execute one task at a time.
- If multiple tasks need to be performed, the operating system
  - rapidly switches between them, giving the illusion of simultaneous execution.
  - time sharing is the technique used to achieve this.
  - Each task is allocated a small time slice to execute before switching to the next task.

### How does multi-tasking work in a multi-core processor?

- In a multi-core processor, each core can execute a separate task simultaneously.
- This allows true parallel execution of multiple processes, improving overall system performance.

### Who manages multi-tasking?

- The operating system is responsible for managing multi-tasking.
- It allocates CPU time to different processes and ensures that each process gets a fair share of CPU resources.
