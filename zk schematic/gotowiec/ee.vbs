Set shell = WScript.CreateObject("WScript.Shell")
shell.Run "java -cp ./libs/*;zkschematic.jar main.schematic" ,0 , false