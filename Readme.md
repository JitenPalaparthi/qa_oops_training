# .Net and Java Installations

## Visual Studio Code and Extensions

- Step-0 :https://code.visualstudio.com/download
- Step-0.1 : Go to help/update vscode
- Step-1: Check .net and java are installed.Open your terminal(in Unix based) or PowerShell(in Windows)..execute the below commands one after the other.
  - Step-1.1: ```dotnet --info```
  - Step-1.2: ```java -version```
  - Step-1.3: If 1.1 is failed, then install .net core by following the link https://dotnet.microsoft.com/en-us/download
  - Step-1.4: If 1.2 is failed, then install java by following the link https://www.oracle.com/java/technologies/downloads/
- Step-2: Upon successful step-1, install .net and c# extensions in Visual Studio Code(ctrl+shift+x) --> .Net Extension Packs,.NET Install Tool for Extension Authors,C# for Visual Studio Code by Microsoft.
- Step-3: Install java extensions in Visual Studio Code(ctrol_shift+x) -->  Extension Pack for Java, Debugger for Java, Test Runner for Java, Language Support for Java(TM)  
- Step-4: Create a directory to write all your programs.
- Step-5: ```git clone https://github.com/JitenPalaparthi/qa_oops_training.git```

## Create-Compilation-Run

## CSharp

- To create a project
- 0. Create a directory 
- 1. cd to that directory
- 2. ```dotnet new console```
- To run csharp project
  - ```dotnet run```

## Java 

- To create a project
- 0. create a directory
- 1. cd to that diretory
- 2. create .java file that contains main mathod
- To run java application
  - 0. compile java application ```java hello.java```
  - 1. run java application ```java hello``` if the class file is hello

- Notes
  - All CSharp examples are in csharp/ directory
  - All Java examples are in java/ directory
