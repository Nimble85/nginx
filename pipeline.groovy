node {
  def test = test
  
  stage ('ECHO') {
    sh """
    echo "this is echo test"
       """
  }
  stage('Directory') {
    dir('test'){
            deleteDir()
            dir('test'){
                dir('test'){
                    dir('76'){
                        dir('767'){
                            sh 'ls -1 | wc -l; touch 675.sh'
                        }
                    }
                }
            }
    }

         
      }
}
