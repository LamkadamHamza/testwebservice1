pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage ("Clean up"){
            steps {
                deleteDir()
            }
        }
        stage ("Clone repo"){
            steps {
                sh "git clone https://github.com/LamkadamHamza/testwebservice1.git"
            }
        }
        stage ("Generate backend image") {
              steps {
                   dir("testwebservice1"){
                      sh "mvn clean install -DskipTests"
                      sh "docker build -t testwebservice1 ."
                  }
              }
          }
        stage ("Run docker compose") {
            steps {
                 dir("testwebservice1"){
                    sh " docker-compose up -d"
                }
            }
        }
    }
}
