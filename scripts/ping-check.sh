#!/usr/bin/env bash
# ping-check.sh – Ping a hostname three times and report the result.
# Usage: ./ping-check.sh <hostname>

# Print usage instructions if no argument is provided
if [ -z "$1" ]; then
    echo "Usage: $0 <hostname>"
    echo "Example: $0 example.com"
    exit 1
fi

HOSTNAME="$1"

echo "Pinging $HOSTNAME (3 times)..."
ping -c 3 "$HOSTNAME"

if [ $? -eq 0 ]; then
    echo "Success: $HOSTNAME is reachable."
else
    echo "Error: $HOSTNAME is not reachable."
    exit 1
fi
