# linko-utils – Overview

## Purpose

**linko-utils** is a small open-source toolkit designed for networking experimentation, Java learning, and DevOps automation. The utilities are intentionally minimal so they are easy to read, understand, and adapt.

## Included Utilities

### NetworkUtils.java

A Java class located at `src/main/java/com/linko/utils/NetworkUtils.java`.

| Method | Description |
|:---|:---|
| `isValidPort(int port)` | Returns `true` if the port is in the range 1–65535. |
| `printBanner()` | Prints an ASCII banner to standard output. |
| `main(String[] args)` | Demonstrates both methods with sample port numbers. |

### ping-check.sh

A Bash script located at `scripts/ping-check.sh`.

Pings the supplied hostname three times and prints whether it is reachable.

## How to Use

### Running NetworkUtils

Compile and run with standard Java tools:

```bash
javac src/main/java/com/linko/utils/NetworkUtils.java
java -cp src/main/java com.linko.utils.NetworkUtils
```

### Running ping-check.sh

Make the script executable, then pass a hostname:

```bash
chmod +x scripts/ping-check.sh
./scripts/ping-check.sh example.com
```

If no hostname is provided the script prints usage instructions and exits.
