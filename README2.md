# In-class activities for CSE 360
## Week 14: White-Box Testing
Rather than looking at the lengthy Password Validator, we will look at a different program that checks driving license eligibility in Arizona.
1. Work with your peers to develop a strategy to test this module. How many test cases are necessary?
2. Write JUnit tests to execute your strategy. Do each of your tests pass or fail? Should they pass or fail?
3. How much of the code do your test cases cover?
4. *Optional, time permitting - food for thought:* If this module works correctly, is it best practice to keep the code as-is? Or should it be refactored? (How easy or difficult was it for your team to develop test cases?)
5. All members of your team should submit the same set of test cases. **Work with your peers; divide and conquer.**

<<<<<<< HEAD
### Technical specifications
Step 1: If you did not clone the repository last week (or are using a different computer), please clone the repository:
=======
### Other specifications
To execute these, clone the repository (either on Powershell, Zsh, Bash, etc.):
```sh
git clone https://github.com/asu-rcthor/cse492-public.git
```
Then, enter the directory with the test executables:
```sh
cd cse492-public/week13
```
Afterwards, run the executable with `java -jar`:
>>>>>>> 068667413195f417de9c9e589603f8eb4abd07d3
```sh
git clone https://github.com/asu-rcthor/cse492-public.git
```
<<<<<<< HEAD
If you cloned the repository last week, update your files for this week:
```sh
cd path_to_directory/cse492-public
git pull
```

Step 2: Verify that you can find this week's contents:
```sh
# If you have just cloned the repository, run this:
ls -al cse492-public/week14

# Otherwise, if you only needed to git pull, run this:
ls -al week14/
```
You should be able to see the folder `drivinglicense` (which contains an Eclipse project).

There are three classes: Main, ArizonaDMV, and ArizonaDMVTest. The Main class contains nothing; focus solely on testing the method in ArizonaDMV.

### IDE problems?
As we go, if we uncover common IDE problems and fixes, I will put them there. For now, coming SoonTM.

If it is taking too long to resolve your IDE issue, please join someone who has their IDE working.
=======
(you can also use `UserNameValidator17.jar` if you use Java 17)

**Because this is a console application, you will not be able to click on your file explorer directly. You will need to launch this via a terminal such as Powershell on Windows, Zsh (search up "Terminal") on Mac, or bash on Linux. (I may add a Python helper (don't count on it), but you should familarise yourself with using a terminal as it is very likely you may need to use a terminal in the future.)**

Alternatively, you may run the jar file on pwn.college (join link is [here](https://pwn.college/dojo/asu-rcthor-thesis~b16ee020/join/) with a challenge specially prepared).
>>>>>>> 068667413195f417de9c9e589603f8eb4abd07d3
