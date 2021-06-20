pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK'
    }
    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean test' 
            }
            post {
                always {
                    sh 'mvn cluecumber-report:reporting'
                    publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'generated-report',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber Advance report'
                ]
                }
            }
        }
    }
}
