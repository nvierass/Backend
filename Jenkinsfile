pipeline {
	agent any
	stages {
		stage('Retrieve') {
			steps {
				git 'https://github.com/nvierass/Backend.git'
			}
		}
		stage('Analisis') {
			steps {
				echo "Prueba JF y Weebhook build"
			}
		}
		stage('Test') {
			steps {
				echo "Prueba JF y Weebhook test"
			}
		}
		stage('Image creation'){
			steps{
				script{
					sh 'docker login -u nvierass -p Grupo4Mingeso'
					sh 'docker build . -t nvierass/mingeso:backend-mingeso-g4'
					sh 'docker push nvierass/mingeso:backend-mingeso-g4'
				}
			}
			
		}
	}
}
