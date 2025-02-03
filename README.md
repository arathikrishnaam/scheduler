## Project Overview
The CPU Scheduling Algorithms Simulator is a comprehensive Java application designed to demonstrate different process scheduling techniques used in operating systems. By providing an interactive interface, users can explore how various scheduling algorithms prioritize and execute processes.

##  Project Structure

CPU-Scheduling-Simulator/
│
├── src/
│   └── scheduler/
│       ├── Process.java            # Process entity definition
│       ├── Scheduler.java          # Main scheduling interface
│       ├── FIFOScheduler.java      # FIFO scheduling implementation
│       ├── SJFScheduler.java       # Shortest Job First implementation
│       ├── RoundRobinScheduler.java # Round Robin scheduling
│       ├── PriorityScheduler.java  # Priority-based scheduling
│       └── Logger.java             # Logging utility
│
├── bin/                            # Compiled class files
└── README.md                       # Project documentation


##  System Requirements
- Java Development Kit (JDK) 8 or higher
- Minimum 2 GB RAM
- Command-line interface or terminal

##  Dependencies
- No external libraries required
- Standard Java libraries used

##  Installation Steps

### 1. Clone the Repository
bash
git clone https://github.com/yourusername/cpu-scheduling-simulator.git
cd cpu-scheduling-simulator


### 2. Compile the Project
bash
# Navigate to the project directory
cd src
javac -d ../bin scheduler/*.java


### 3. Run the Application
bash
# Navigate to the bin directory
cd ../bin
java scheduler.Scheduler

### Example Interaction

Enter number of processes: 3

Enter details for Process 1:
Arrival Time: 0
Burst Time: 4
Priority: 2

Enter details for Process 2:
Arrival Time: 1
Burst Time: 3
Priority: 3

Enter details for Process 3:
Arrival Time: 2
Burst Time: 2
Priority: 1

Select Scheduling Algorithm:
1. FIFO
2. SJF
3. Round Robin
4. Priority Scheduling
Enter choice: 2

## Planned Enhancements
- [ ] Advanced error handling
- [ ] More scheduling algorithms
- [ ] Graphical process visualization
- [ ] Detailed performance analytics
- [ ] Configurable scheduling parameters
