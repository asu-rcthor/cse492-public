# In-class activities for CSE 360
## Week 14: White-Box Testing
Rather than looking at the lengthy Password Validator, we will look at a different program that checks driving license eligibility in Arizona.
1. Work with your peers to develop a strategy to test this module. How many test cases are necessary?
2. Write JUnit tests to execute your strategy. Do each of your tests pass or fail? Should they pass or fail?
3. How much of the code do your test cases cover?
4. *Optional, time permitting - food for thought:* If this module works correctly, is it best practice to keep the code as-is? Or should it be refactored? (How easy or difficult was it for your team to develop test cases?)
5. All members of your team should submit the same set of test cases. **Work with your peers; divide and conquer.**

### Technical specifications
#### Step 1: If you did not clone the repository last week (or are using a different computer), please clone the repository:
```sh
git clone https://github.com/asu-rcthor/cse492-public.git
```
If you cloned the repository last week, update your files for this week:
```sh
cd path_to_directory/cse492-public
git pull
```

#### Step 2: Verify that you can find this week's contents:
```sh
# If you have just cloned the repository, run this:
ls -al cse492-public/week14

# Otherwise, if you only needed to git pull, run this:
ls -al week14/
```
You should be able to see the folder `drivinglicense` (which contains an Eclipse project). Import this project on Eclipse. (Hint: If you need to see your current directory, use `pwd` then copy that over to Eclipse!)

There are three classes: Main, ArizonaDMV, and ArizonaDMVTest. The Main class contains nothing; focus solely on testing the method in ArizonaDMV.

#### Step 3: Setup this project in Eclipse:

In Eclipse, select the `drivinglicense` folder when importing this project from the filesystem. (Specifically, `cse492-public/week14/drivinglicense`.) Once complete, develop a strategy and write test cases with your peers. A sample test case has already been provided for you.

As you write test cases, you may find the java.time.LocalDate class to be useful. Here is a quick link for the documentation: <https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html>

### IDE problems?
As we go, if we uncover common IDE problems and fixes, I will put them there. For now, coming SoonTM.
* I was able to clone this repository on a Mac in BYENG 214. (I could not test on a Windows computer, as those use JRE 25, and it appears that JUnit 5 may not be compatible.)

If it is taking too long to resolve your IDE issue, please join someone who has their IDE working.
