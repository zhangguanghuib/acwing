<h1>This doc shows how to debug TypeScript in Visual Studio Code</h1>

Step 1:  Download and Install NodeJS<br/>
Step 2:  Create a folder and open this folder by Visual Studio Code<br/>
Step 3:  Open Terminal and Install typescript<br/>
<img width="677" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/96819c30-6694-4025-9a0f-f0c04d11461d"><br/>
Step 4:  Run npm init to create package.json, just press enter to use default value<br/>
<img width="741" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/eefee76f-78ae-4090-8daf-e80b59507b1c"><br/>
Step 5: Run tsc --init to tsconfig.json, and make sure sourceMap is true, and also specify an outDir to store the js file.
<img width="976" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/60602246-edf9-4cfe-a45a-5d03c7b8e267"><br/>
Step 6. create launch.json<br/>
```ps
 "preLaunchTask": "tsc: build - tsconfig.json",
```
<img width="598" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/6c5423ef-16a6-42fb-ab7e-d955e0a1a678"><br/>
Step 7. Create src folder, and then create a TS file in it, 
<img width="845" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/6647e7ea-ae3b-45a9-bd58-d0bef0cd22d5"><br/>
Step 8:  Click Run->Start debugging. see the breakpoint is already hit:
<img width="1008" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/53529414-ee4d-4f08-aef7-f8e92b2423bc"><br/>
Step 9:  You also can cd to the output folder where JS  is in, and then run this command:
node  *.js file, see the breakpoint is also hit, and the console.log is working as well<br/>
<img width="994" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/70b88bfe-6c70-46e4-9fa8-392a2b0c5f66">





