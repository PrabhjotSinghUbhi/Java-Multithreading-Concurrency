# Basics

---

## Context Switching

### What is Context Switching?

- Context Switching is the process of storing the state of a currently running process or thread so that it can be resumed later.

- It allows multiple processes or threads to share the same CPU resources by switching between them.

### How does Context Switching work?

- When a process or thread is interrupted (e.g., by a timer interrupt), the operating system saves its current state (context) to a data structure called a Process Control Block (PCB).

- Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.

- The operating system then loads the state of the next process or thread to be executed from its PCB and resumes its execution.
