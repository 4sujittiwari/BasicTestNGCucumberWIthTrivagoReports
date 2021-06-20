pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK'
    }
    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean install' 
            }
            post {
                always {
                    sh 'mvn clean cluecumber-report:reporting'
                    publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'target/generated-report/',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber Advance report'
                ]
                }
            }
        }
    }
}
