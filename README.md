This Java-based CPU Scheduling Simulator provides a comprehensive tool for understanding and analyzing different process scheduling algorithms used in operating systems. The simulator allows users to input multiple processes and evaluate their execution under various scheduling strategies.

## Scheduling Algorithms

### 1. First-In-First-Out (FIFO) Scheduling
- **Description**: Processes are executed in the order they arrive
- **Characteristics**:
  - Simple, first-come-first-served approach
  - No prioritization
  - Minimal overhead
- **Pros**: 
  - Easy to implement
  - Fair for similar burst time processes
- **Cons**:
  - Long waiting times for processes arriving later
  - Doesn't consider process priority or burst time

### 2. Shortest Job First (SJF) Scheduling
- **Description**: Selects the process with the shortest burst time next
- **Characteristics**:
  - Minimizes average waiting time
  - Prefers shorter processes
- **Pros**:
  - Optimal average waiting time
  - Reduces total completion time
- **Cons**:
  - Potential starvation for long processes
  - Requires accurate burst time prediction

### 3. Round Robin Scheduling
- **Description**: Allocates CPU time in fixed time quantum intervals
- **Characteristics**:
  - Preemptive scheduling
  - Circular queue of processes
- **Key Parameters**:
  - Time Quantum: Determines slice of CPU time per process
- **Pros**:
  - Fair CPU time distribution
  - Responsive for interactive systems
- **Cons**:
  - Overhead from frequent context switching
  - Performance depends on time quantum selection

### 4. Priority Scheduling
- **Description**: Executes processes based on assigned priority
- **Characteristics**:
  - Lower priority number indicates higher priority
  - Can be preemptive or non-preemptive
- **Pros**:
  - Flexible prioritization
  - Supports critical process management
- **Cons**:
  - Risk of priority inversion
  - Potential starvation of low-priority processes

### 5. Uni-Programming Scheduling
- **Description**: Single program execution at a time
- **Characteristics**:
  - No multiprocessing
  - Sequential process execution
- **Pros**:
  - Simple implementation
  - Minimal resource contention
- **Cons**:
  - Low system utilization
  - Inefficient for multiple processes

##  Installation Steps

### Prerequisites
- Java Development Kit (JDK) 11+
- Git
- Command-line terminal

### Project Structure
```
cpu-scheduling-simulator/
├── src/
│   └── scheduler/
│       ├── Process.java
│       ├── Scheduler.java
│       ├── FIFOScheduler.java
│       ├── SJFScheduler.java
│       ├── RoundRobinScheduler.java
│       ├── PriorityScheduler.java
│       ├── UniProgrammingScheduler.java
│       └── Logger.java
├── bin/
└── README.md
```

### Step-by-Step Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/cpu-scheduling-simulator.git
   cd cpu-scheduling-simulator
   ```

2. **Create Required Directories**
   ```bash
   mkdir -p bin
   ```

3. **Compile the Project**
   ```bash
   # Navigate to the project directory
   cd src
   
   # Compile all Java files to bin directory
   javac -d ../bin scheduler/*.java
   ```

4. **Run the Application**
   ```bash
   # Navigate to the bin directory
   cd ../bin
   
   # Run the Scheduler
   java scheduler.Scheduler
   ```

### Troubleshooting Installation
- **Compilation Errors**: Ensure JDK 11+ is properly installed
  ```bash
  java -version
  javac -version
  ```
- **Class Not Found**: Verify correct directory structure and package names
- **Permission Issues**: Check file permissions
  ```bash
  chmod +x src/scheduler/*.java
  ```

## Detailed Example Interaction

### Scenario: Process Scheduling Demonstration
```
Enter number of processes: 3

Enter Arrival Time, Burst Time, Priority for Process 1:
Arrival Time: 0
Burst Time: 4
Priority: 2

Enter Arrival Time, Burst Time, Priority for Process 2:
Arrival Time: 1
Burst Time: 3
Priority: 3

Enter Arrival Time, Burst Time, Priority for Process 3:
Arrival Time: 2
Burst Time: 2
Priority: 1

Select Scheduling Algorithm:
1. FIFO
2. SJF
3. Round Robin
4. Priority Scheduling
Enter choice: 2
```

#### Sample Output
```
Process Execution Summary:
Process 3 | Start: 1 | Finish: 3
Process 2 | Start: 3 | Finish: 6
Process 1 | Start: 6 | Finish: 10
```

## Advanced Usage Tips
- **Accurate Input**: Provide precise arrival times and burst times
- **Time Quantum**: For Round Robin, choose an optimal time quantum
- **Priority Management**: Understand priority assignment strategies

## Performance Metrics Calculated
- **Start Time**: When process begins execution
- **Completion Time**: When process finishes
- **Waiting Time**: Total idle time before execution
- **Turnaround Time**: Total time from arrival to completion

## Troubleshooting
- Unexpected results? Verify input data
- Context switching overhead not modeled
- Assumes ideal scheduling conditions
