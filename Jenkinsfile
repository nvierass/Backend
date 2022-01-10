pipeline {
	agent any
	stages {
		stage ('Retrieve'){
			steps {
				git branch: 'main',  url: 'https://github.com/nvierass/Backend'
			}
		}
		stage ('JUnit testing'){
			withGradle {
				sh './gradlew test'
				junit 'test-results.xml'
			}
		}
		stage ('Sonarqube analisis'){
			withGradle {
				sh './gradlew sonarqube'
			}
		}
		stage('Image creation'){
			steps{
				script{
					sh 'docker build . -t nvierass/mingeso:backend-mingeso-g4'
					sh 'docker push nvierass/mingeso:backend-mingeso-g4'
				}
			}
		}
	}
}
