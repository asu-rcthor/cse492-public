# In-class activities for CSE 360
## Week 13: Black-Box Testing
An implementation of the Username Validator is given as a compiled executable.
1. Work with your team and determine a strategy to test this program. **This is a black-box test, so no source code is provided!** Use the FSM for the Username Validator from Individual Homework 1 to develop your tests.
2. Execute the program and take note of:
	* What are your test cases? Ensure that the test cases that you have selected are **thorough**.
	* What is the rationale for your test cases? (For example, is there a requirement you are trying to test?)
	* Do the test cases pass or fail? **Should** the test pass or fail?
3. All members of your team should submit the same set of test cases. **Work with your team; divide and conquer.**

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
```sh
java -jar UserNameValidator21.jar # run the executable
```
(you can also use `UserNameValidator17.jar` if you use Java 17)

**Because this is a console application, you will not be able to click on your file explorer directly. You will need to launch this via a terminal such as Powershell on Windows, Zsh on Mac, or bash on Linux. (I may add a Python helper (don't count on it), but you should familarise yourself with using a terminal as it is very likely you may need to use a terminal in the future.)**

Alternatively, you may run the jar file on pwn.college (join link is [here](https://pwn.college/dojo/asu-rcthor-thesis~b16ee020/join/) with a challenge specially prepared).
