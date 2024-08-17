pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Denyaar/K8SpringDocker']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                script{
                  sh 'docker build -t denyaar/k8springdocker .'
                }
            }
        }
        stage('Push Image to hub') {
            steps {
                script{
                     withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u denyaar -p ${dockerhubpwd}'
                    }
                    sh 'docker push denyaar/k8springdocker'
                }
            }
        }
    }
}