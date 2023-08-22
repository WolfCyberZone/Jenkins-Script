/* This scrips is for the logisc flow of the CI/CD pipeline for the project Salud

Important Jenkins commands we use in this script:
- echo: prints a message to the console
- stage: defines a stage of the pipeline
- steps: defines the steps of a stage
- bat: executes a batch command "This code use bat because the operating system is Windows"
-dir(): changes the current directory
*/


pipeline{

    agent any
    
    stages{
        // Clean the workspace
        stage('Clean'){
            steps{
                echo 'Clean Dir...'
            }
        }
        
        // Clone Repository
        stage('Clone Repo'){
            steps{
                echo 'Clone Repo...'
            }
        }
        
        // Build The Project
        stage('Build'){
            steps{
                echo '...'
            }
        }
// Run Unit & Integration Testing
        stage('Unit & Integration Testing'){
            steps{
                echo 'Passing...'
            }
        }
        // Test Report
        stage('Test Report'){
            steps{
                echo 'Test Report...'
            }
        }
        // Merge with Developer Branch
        stage('Merge'){
            steps{
                echo 'Merge with Developer Branch...'
            }
        }
        // Build & Deploy to Staging
        stage('Build & Deploy'){
            steps{
                echo 'Build & Deploy to Staging...'
            }
        }
        //Completed 
        stage('Completed'){
            steps{
                echo 'Completed...'
            }
        }
        //Test GitHub Webhook
        stage('Test GitHub Webhook'){
            steps{
                echo 'Test GitHub Webhook...'
            }
        }
    }

}

