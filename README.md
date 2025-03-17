# TrackFlow: Intelligent Logistics Management Suite

TrackFlow is a comprehensive Java-based application designed to manage courier services, cargo shipments, moving services, and shipment tracking with real-time analytics and optimization features.

## Project Files
TrackFlow/
│
├── TrackFlow.jar
├── src/
│ ├── View/
│ │ ├── Dashboard.java
│ │ ├── Authentication.java
│ │ ├── ShipmentTracker.java
│ │ ├── CargoManager.java
│ │ ├── MovingServices.java
│ │ └── CourierData.java
│ ├── Core/
│ │ ├── TrackingEngine.java
│ │ ├── CargoOperations.java
│ │ ├── MovingCoordinator.java
│ │ ├── LogisticsOptimizer.java
│ │ ├── DatabaseHandler.java
│ │ └── AnalyticsEngine.java
│ └── resources/
│ ├── icons/
│ ├── images/
│ └── configurations/
├── lib/
│ ├── mysql-connector-java.jar
│ └── dependencies.jar
├── documentation/
│ ├── user_guide.pdf
│ └── technical_specifications.pdf
└── README.md

## Dataset

The system utilizes three optimized databases:

- **cargo_operations**: Manages all cargo shipment data
- **moving_services**: Handles moving service information
- **shipment_tracking**: Real-time tracking data for all shipments

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11+
- MySQL Server 8.0+
- Java Swing Library
- JDBC Connector

### Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/TrackFlow.git

2. **Clone the Repository:**
   ```bash
   cd TrackFlow

3. **Configure Your Environment:**
  Update database configurations in resources/configurations/database.properties
  Set up your MySQL databases using the provided schema files

4. **Build the Project:**
   ```bash
   javac -cp ".;lib/*" src/*.java
   
5. **Launch the Application:**
   ```bash
    java -jar TrackFlow.jar

### Key Features
Real-time shipment tracking with GPS integration
Intelligent route optimization for deliveries
Comprehensive analytics dashboard
Multi-user access with role-based permissions
Automated shipping cost calculator
Historical data reporting and trend analysis

### License
TrackFlow is released under the Apache License 2.0. See LICENSE for more information.
