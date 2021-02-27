pipeline{
    agent any

    stages{
        stage('Build'){
            steps {
                git 'https://github.com/sagarahuja/jenkins.git'
                sh './mvnw clean compile deploy'
            }
        }
    }
}