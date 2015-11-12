#Homework 9 : Methods and Loops

## Introduction
This markdown file is a report that contains all of my work on the Addition Game.
For Homework 9, we reworked the game using method calls and for loops.

## Outline
```
1. Call addition game method
2. Create addition game method
3. Create for loop for running rounds
3. Create method for getting and checking user answer
```

## References and Literature
```
Listing 5.7 pg. 176
Kasey Delk's java project from Homework 8
Listing 2.3 pg. 38
```

## Code
```java
import java.util.Scanner;

public class AdditionGameWithMethodsLoops {
	public static void main(String[] args) {
		
		// call addition game method
		AdditonGameMethod();
	}
	public static void AdditonGameMethod() {
		
		int hardness = 5;
		int hardnessStep = 2;
		int score = 0;
		
		// create for loop for running rounds
		int numberOfRounds = 4;
		for(int roundNumber = 1; 
		roundNumber <= numberOfRounds;  
		roundNumber = roundNumber + 1){
			System.out.println("Round " + roundNumber);
			boolean isAnswerCorrect = getAndCheckStudentAnswer(hardness);
			if(isAnswerCorrect){
				System.out.print("Your score was " + score + " and is now ");
				score = score + hardness;
				System.out.println(score + ".");
				
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					hardness = hardness * hardnessStep;
					System.out.println(hardness + ".");
				}
			}else{
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					if(hardness>5){
						hardness = hardness / hardnessStep;
					}
					System.out.println(hardness + ".");
				}
			}
		}
		System.out.println("The game is complete.");
		System.out.println("Your final score was " + score );
	}
	
	public static boolean getAndCheckStudentAnswer(int hardness) {
		int number1 = (int)(Math.random()*hardness);
		int number2 = (int)(Math.random()*hardness);
		System.out.println("Add " + number1 + " + " + number2);
		System.out.println("Please enter integars only.");
	
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (number1 + number2)){
			System.out.println("Good work! Your answer was correct.");
			return true;
		}else{
			System.out.println("Nice try. The correct answer was " + (number1 + number2));
			return false;
		}
	}
}
```
## Console
```java
Round 1
Add 3 + 4
Please enter integars only.
7
Good work! Your answer was correct.
Your score was 0 and is now 5.
Your hardness was 5 and is now 10.
Round 2
Add 8 + 3
Please enter integars only.
11
Good work! Your answer was correct.
Your score was 5 and is now 15.
Your hardness was 10 and is now 20.
Round 3
Add 17 + 15
Please enter integars only.
32
Good work! Your answer was correct.
Your score was 15 and is now 35.
Your hardness was 20 and is now 40.
Round 4
Add 19 + 22
Please enter integars only.
41
Good work! Your answer was correct.
Your score was 35 and is now 75.
The game is complete.
Your final score was 75

```
## Command Prompt

```

Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>e:

E:\>cd KLD_CS1_WorkSpace

E:\KLD_CS1_WorkSpace>cd AdditionGameWithMethodsLoops

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git init
Initialized empty Git repository in E:/KLD_CS1_WorkSpace/AdditionGameWithMethods
Loops/.git/

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git add .

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'LAB@STF126G-PC.(none)')

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops> git config --global user.emai
l "delkk@student.swosu.edu"

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git config --global user.name
"KaseyDelk"

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git commit -m "first commit"
[master (root-commit) 3abfa3c] first commit
 4 files changed, 29 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/AdditionGameWithMethodsLoops.class
 create mode 100644 src/AdditionGameWithMethodsLoops.java

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git remote add origin https://
github.com/KaseyDelk/AdditionGameWithMethods-Loops.git

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git push -u orgin master
fatal: 'orgin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git push -u origin master
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.14 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditionGameWithMethods-Loops.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git checkout -b dev
Switched to a new branch 'dev'

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git status
On branch dev
nothing to commit, working directory clean

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev


E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>git push --set-upstream origin
 dev
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditionGameWithMethods-Loops.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

E:\KLD_CS1_WorkSpace\AdditionGameWithMethodsLoops>

```

## Summary
I know that methods are supposed to make our lives easier, but I found this homework assignment difficult. I'm glad that we worked on it in class together. I have a better understanding of for loops after this assignment, and while I have a lot more to learn about methods, they are very helpful for testing.
