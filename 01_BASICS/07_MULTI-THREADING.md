# Basics

---

## Multi Threading

### What is Multi Threading?

- Multi Threading is a programming concept that allows multiple threads to run concurrently within a single process.
- Threads are lightweight processes that share the same memory space but can execute independently.

### Benefits of Multi Threading

- Improved performance: Multi Threading can significantly improve the performance of applications by utilizing CPU resources more efficiently.
- Responsiveness: Applications can remain responsive to user input while performing background tasks.
- Resource sharing: Threads within the same process can easily share data and resources.

- Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.

### Example of Multi Threading

- A web server can handle multiple client requests simultaneously by creating a new thread for each request.
- A text editor can allow users to type while simultaneously checking for spelling errors in the background using separate threads.
- A game can use multiple threads to handle different aspects of the game, such as rendering graphics, processing user input, and managing game physics.

### Challenges of Multi Threading

- Complexity: Multi Threading introduces complexity in program design and implementation.

- Synchronization: Coordinating access to shared resources between threads can lead to issues like **race conditions** and **deadlocks**.

- Debugging: Debugging multi-threaded applications can be more challenging than single-threaded ones due to the **non-deterministic nature of thread execution**.

- Overhead: Creating and managing multiple threads can introduce overhead, which may negate the performance benefits in some cases.

### Who manages Multi Threading?

- The operating system is responsible for managing multi-threading.

- It allocates CPU time to different threads and ensures that each thread gets a fair share of CPU resources.

- The programming language runtime or libraries may also provide support for multi-threading, making it easier for developers to implement multi-threaded applications.

- Examples include Java's concurrency libraries, Python's threading module, and C++'s standard thread library.

### How does javascript handle Multi Threading?

- JavaScript is single-threaded by nature, meaning it can only execute one task at a time.

- However, JavaScript can achieve concurrency through mechanisms like Web Workers, which allow for background threads to run scripts without blocking the main thread.

- This enables web applications to perform tasks like data processing or network requests in the background while keeping the user interface responsive.

- Additionally, JavaScript uses an event-driven model with an event loop to handle asynchronous operations, allowing it to manage multiple tasks without traditional multi-threading.

- This means that while JavaScript does not support multi-threading in the traditional sense, it can still handle multiple tasks concurrently through these mechanisms.

- For example, when a user clicks a button to fetch data from a server, the request is sent asynchronously, allowing the main thread to continue processing other tasks while waiting for the response.

### single core vs multi core system

- In a single-core system, both processes and threads are managed by the OS scheduler through ***time slicing*** and ***context switching*** to create the illusion of concurrency.

- In a multi-core system, processes and threads can be distributed across multiple cores, allowing true parallel execution. OS schedulers play a crucial role in efficiently allocating tasks to available cores.

- However, multi-core systems also introduce challenges such as load balancing and ensuring that threads are efficiently utilizing the available cores.
