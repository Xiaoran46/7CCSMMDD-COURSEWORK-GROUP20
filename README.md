# MDD_Group20
运行步骤：
1. 用户将“uk.ac.kcl.inf.group20.docker”，“uk.ac.kcl.inf.group20.docker.ide”，“uk.ac.kcl.inf.group20.docker.tests”, “uk.ac.kcl.inf.group20.docker.ui” 和 “uk.ac.kcl.inf.group20.docker.ui.tests”
2. 用户运行“uk.ac.kcl.inf.group20.docker”文件，然后进入到runtime eclipse中
3. 然后导入TestDocker和uk.ac.kcl.inf.group20.docker.xpect
4. 用户根据自己想实现的功能和该DSML的相关语法及语法提示输入自然语言命令



Grammar：

-Run statement：

  Docker version：
  
    "docker run [OPTIONS] IMAGE [COMMAND] [ARG...]"
    
  Abstract version：
  
    "order=RunorCreate runOptions += RunOption* image = Image commands = STRING"
  
  RunOptions:
  
<img width="601" alt="figure1" src="https://user-images.githubusercontent.com/57056248/114551234-b2472800-9c95-11eb-834f-33929695a718.png">


-Remove Statement:

  Docker version：
  
    "docker rm [OPTIONS] CONTAINER [CONTAINER...]"
  
  Abstract version：
  
    "remove rmOptions=RmOptions? containerName = [ContainerNameDeclaration]"
  
  Remove options:
  
  <img width="605" alt="figure2" src="https://user-images.githubusercontent.com/57056248/114551725-5fba3b80-9c96-11eb-900c-509a4da9a13f.png">


-Start/Stop/Restart/Pause/Unpause Statement

  Docker version:
  
    "docker start [OPTIONS] CONTAINER [CONTAINER...]"
    "docker stop [OPTIONS] CONTAINER [CONTAINER...]"
    "docker restart [OPTIONS] CONTAINER [CONTAINER...]"
    "docker pause CONTAINER [CONTAINER...]"
    "docker unpause CONTAINER [CONTAINER...]"
    
  Abstract version：
  
    "start containerName = [ContainerNameDeclaration]"
    "stop containerName = [ContainerNameDeclaration]"
    "restart containerName = [ContainerNameDeclaration]"
    "pause containerName = [ContainerNameDeclaration]"
    "unpause containerName = [ContainerNameDeclaration]"
 

-Kill Statement:
  
  Docker version
  
    "docker kill [OPTIONS] CONTAINER [CONTAINER...]"
  
  Abstract version：
    
    "kill=KillOption containerName = [ContainerNameDeclaration]"
  
  Kill options:
  
  <img width="603" alt="figure3" src="https://user-images.githubusercontent.com/57056248/114554276-1cad9780-9c99-11eb-99c5-212ffcf1d31a.png">

-Execute Statement:
  
  Docker version
  
    "docker exec [OPTIONS] CONTAINER COMMAND [ARG...]"
  
  Abstract version：
    
    "execute execOptions += ExecOption* containerName = [ContainerNameDeclaration] commands = STRING"
  
  execute options:
  
  <img width="604" alt="figure4" src="https://user-images.githubusercontent.com/57056248/114554364-3c44c000-9c99-11eb-93a8-f3cb6a5a4b76.png">

-Ps Statement:
  
  Docker version
  
    "docker ps [OPTIONS]"
  
  Abstract version：
    
    "ps psOptions += PsOptions+"
  
  Ps options:
  
  <img width="605" alt="figure5" src="https://user-images.githubusercontent.com/57056248/114555500-57fc9600-9c9a-11eb-990e-a0057553fdf6.png">
  
-Inspect Statement:
  
  Docker version
  
    "docker inspect [OPTIONS] NAME|ID [NAME|ID...]"
  
  Abstract version：
    
    "inspect inspectOptions += InspectOptions+"
  
  inspect options:
  
  <img width="603" alt="figure6" src="https://user-images.githubusercontent.com/57056248/114557511-546a0e80-9c9c-11eb-8c42-2696c6018ed5.png">
 
-Attach Statement:
  
  Docker version
  
    "docker attach [OPTIONS] CONTAINER"
  
  Abstract version：
    
    "attach attachOption = AttachOption containerName = [ContainerNameDeclaration]"
  
  attach options:
  
  <img width="602" alt="figure7" src="https://user-images.githubusercontent.com/57056248/114558322-21744a80-9c9d-11eb-9f47-70996357f22f.png">

-Event Statement:
  
  Docker version
  
    "docker events [OPTIONS]"
  
  Abstract version：
    
    "events' eventOptions += EventOptions+"
  
  events options:
  
  <img width="602" alt="figure7" src="https://user-images.githubusercontent.com/57056248/114564891-55526e80-9ca3-11eb-873e-ecfef67c82ca.png">

-Logs Statement:
  
  Docker version
  
    "docker logs [OPTIONS] CONTAINER"
  
  Abstract version：
    
    "logs logOptions += LogOptions* containerName = [ContainerNameDeclaration]"
  
  logs options:
  
 <img width="608" alt="figure9" src="https://user-images.githubusercontent.com/57056248/114565645-0d801700-9ca4-11eb-8436-1d060a37bdde.png">

-Wait/Export/Port/Difference Statement

  Docker version
  
    "docker wait [OPTIONS] CONTAINER [CONTAINER...]"
    "docker export [OPTIONS] CONTAINER"
    "docker port [OPTIONS] CONTAINER [PRIVATE_PORT[/PROTO]]"
    "docker diff [OPTIONS] CONTAINER"
  
  Abstract version：
    
    "wait containerName = [ContainerNameDeclaration]"
    "export file_path = STRING containerName = [ContainerNameDeclaration]"
    "port containerName = [ContainerNameDeclaration] private_port=STRING"
    "check_different' containerName = [ContainerNameDeclaration]"

-Commit Statement:
  
  Docker version
  
    "docker commit [OPTIONS] CONTAINER [REPOSITORY[:TAG]]"
  
  Abstract version：
    
    "commit commitOptions += CommitOptions* containerName = [ContainerNameDeclaration] repository = STRING"
  
  Commit options:
  
 <img width="600" alt="figure10" src="https://user-images.githubusercontent.com/57056248/114568395-aa43b400-9ca6-11eb-9928-73662d995cb1.png">

-Copy Statement:
  
  Docker version
  
    "docker cp [OPTIONS] CONTAINER:SRC_PATH DEST_PATH|-"
  
  Abstract version：
    
    "copy link = LinkOption source=SourceOption destination = STRING"
  
  link options:
  
 <img width="603" alt="figure11" src="https://user-images.githubusercontent.com/57056248/114569779-d7449680-9ca7-11eb-9348-44f25a98b2be.png">

  SourceOption: option = STRING | [ContainerNameDeclaration]	
  
-Image Statement:
  
  Docker version
  
    "docker images [OPTIONS] [REPOSITORY[:TAG]]"
  
  Abstract version：
    
    "image imageOptions += ImageOptions* repository = STRING"
  
  Image options:
  
 <img width="606" alt="figure12" src="https://user-images.githubusercontent.com/57056248/114571254-1b846680-9ca9-11eb-9492-841499c2c094.png">

-Remove Image Statement:
  
  Docker version
  
    "docker rmi [OPTIONS] IMAGE [IMAGE...]"
  
  Abstract version：
    
    "removeImg removeimageOptions += RemoveImageOptions* image = STRING"
  
  Remove Image options:
  
 <img width="604" alt="截屏2021-04-13 下午10 42 36" src="https://user-images.githubusercontent.com/57056248/114572023-b54c1380-9ca9-11eb-807b-0ac0fd1e88ee.png">



  
  
  
  
  
  
  
  
  
  
  
