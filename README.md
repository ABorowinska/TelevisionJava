##TV Simulator in Java

A simple Object-Oriented Programming (OOP) project simulating the basic functionalities of a television set. The project is written in Java and demonstrates core OOP concepts such as class design, object creation, constructors, state management, and basic logic flow.

## Features

The `Television` class simulates a real-life TV with the following functionalities:

- **Power Management:** Turn the TV on/off. When off, actions like changing channels or volume are restricted.
- **Channel Control:**
  - Change to a specific channel within a valid range.
  - Channel Up/Down logic that loops back (e.g., from the last channel to 1).
  - Skips a predefined "technical channel" (e.g., channel 13) when navigating channels sequentially.
- **Volume Control:**
  - Change to a specific volume within limits.
  - Volume Up/Down with boundary checks (0 to max volume).
  - Instant mute functionality.
- **Constructors:** Both parameterized and parameterless constructors are available to instantiate TVs with specific or default specifications.

## Project Structure

- `Television.java` - Contains the logic and state of the TV (condition, volume, current channel, max limits, technical channel).
- `Main.java` - A test class that creates multiple TV instances (turned on, turned off, and default) and runs various scenarios to verify the logic.

##  How to Run

1. Clone this repository:
   ```bash
   git clone [https://github.com/YourUsername/TV-Simulator-Java.git](https://github.com/YourUsername/TV-Simulator-Java.git)
