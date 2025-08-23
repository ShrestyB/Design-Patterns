# Logger Singleton (Java)

A thread-safe logging utility implemented using the **Singleton Pattern** with `volatile` and double-checked locking.

## Features

- **Singleton Pattern**: Only one `Logger` instance exists during runtime.
- **Thread Safety**: Uses `volatile` and `synchronized` to ensure safe concurrent access.
- **Formatted Logging**: Logs messages with timestamp and log level.
- **Simple API**: Log messages from anywhere in your application.

---

## Files

- [`Logger.java`](Logger.java): Thread-safe singleton logger with log levels.
- [`LogLevel.java`](LogLevel.java): Enum for log levels (`INFO`, `ERROR`, `DEBUG`).
- [`PaymentService.java`](PaymentService.java): Example service using the logger.
- [`Main.java`](Main.java): Entry point demonstrating logger usage.

---

## How the Singleton Works

The `Logger` class ensures only one instance is created, even in a multithreaded environment, using:

```java
private static volatile Logger instance;
```

The `volatile` keyword ensures that changes to the `instance` variable are visible to all threads immediately, preventing issues with instruction reordering and caching.

Combined with double-checked locking in the `getInstance()` method, this guarantees that only one instance of `Logger` is ever created, even if multiple threads try to initialize it at the same time:

```java
public static Logger getInstance() {
    if (instance == null) {
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
        }
    }
    return instance;
}
```


