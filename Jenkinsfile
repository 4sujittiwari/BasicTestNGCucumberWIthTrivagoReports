pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean install' 
            }
        }
    }
}
