pipeline{

    agenmt any
    stages{
        stage('Git Checkout'){
            steps{
                git branch: 'master', url: 'https://github.com/puneethkumar02/BrownfieldAirlines.git'
            }
        }
           stage('unit testing'){
            steps{
             sh 'mvn test'
            }
        }
    }
}