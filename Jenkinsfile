pipeline{

    agenmt any
    stages{
        stage('Git Checkout'){
            steps{
                git branch: 'master', url: 'https://github.com/puneethkumar02/BrownfieldAirlines.git'
            }
        }
           stage('build'){
            steps{
             sh 'mvn clean package'
            }
        }
    }
}
