Session and Talk Management System
==================================

This project provides a simple Java implementation for managing sessions and talks within a conference or event setting. It includes classes to define sessions and talks and provides functionalities such as scheduling and canceling talks, managing session details, and sorting talks by their start time.

Table of Contents
-----------------

*   Features
    
*   Classes
    
*   Usage
    
*   How to Run
    
*   Contributing
    
*   License
    

Features
--------

*   Add and schedule talks in a session.
    
*   Cancel talks from a session.
    
*   Automatically sort talks based on their start time.
    
*   Manage session details, including ID, location, and the current list of talks.
    
*   String representation of session and talk objects for easy debugging and display.
    

Classes
-------

### Session

The Session class is responsible for managing the details of a session, including:

*   **Attributes:**
    
    *   sessionId: The unique ID of the session.
        
    *   location: The location of the session.
        
    *   talkList: An array of talks scheduled for the session (up to 4 talks).
        
    *   currentSize: The current number of talks in the session.
        
*   **Methods:**
    
    *   scheduleTalk(Talk talk): Adds a talk to the session if there is space and if it isn’t already scheduled.
        
    *   cancelTalk(Talk talk): Removes a scheduled talk from the session.
        
    *   getSessionId(), getLocation(), and other getters/setters.
        
    *   Overrides toString() to provide a string representation of the session.
        

### Talk

The Talk class represents an individual talk and implements Comparable for sorting based on start time.

*   **Attributes:**
    
    *   talkId: Unique identifier for the talk.
        
    *   speaker: Name of the speaker.
        
    *   title: Title of the talk.
        
    *   startTime: Start time of the talk as a LocalDateTime object.
        
*   **Methods:**
    
    *   Getters and setters for all attributes.
        
    *   Overrides compareTo(Talk otherTalk) to sort talks by start time.
        
    *   Overrides toString() to provide a string representation of the talk.
        

Usage
-----

### Example

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   // Create a session  Session session = new Session("S01", "Conference Room A");  // Create talks  Talk talk1 = new Talk("T01", "Alice", "Introduction to Java", "2023-12-19T09:00:00");  Talk talk2 = new Talk("T02", "Bob", "Advanced Java", "2023-12-19T11:00:00");  // Schedule talks  session.scheduleTalk(talk1);  session.scheduleTalk(talk2);  // Display session details  System.out.println(session);  // Cancel a talk  session.cancelTalk(talk1);  System.out.println(session);   `

How to Run
----------

1.  git clone https://github.com/yourusername/session-talk-management.git
    
2.  Navigate to the project directory and open it in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
    
3.  Ensure Java 8 or higher is installed.
    
4.  javac Practical\_11/\*.javajava Practical\_11.Session
    

Contributing
------------

Contributions are welcome! Please fork the repository, create a new branch, and submit a pull request with your changes. Make sure your code is well-documented and follows Java best practices.

License
-------

This project is licensed under the MIT License. See the LICENSE file for more details.
