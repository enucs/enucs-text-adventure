# enucs-text-adventure
The ENUCS text adventure for learning how to use git

## Basic Git Commands

### Add
This command is used to add any files in the current working directory into the Index or staging area.

Only files that have been added by git are actually tracked by git.

This can be done as many times as you want before you commit something.

#### Usage
```bash
git add .
```
This add everything in the current directory, and works recursively down other folders.

```bash
git add <filename>
```
This adds only the selected file to the staging area.

### Commit
This command takes whatever is in the Index or staging area and creates a commit out of it.

A commit is a difference between 2 text files and shows which lines have been added or deleted.

After this command is run the HEAD is moved to this new commit.

#### Usage
```bash
git commit -m <message>
```
This creates a commit and gives it the message that you give it.

### Push
This command takes any commits that you have on your local copy of the repository. and pushes them to the remote repository.

This how you can share your commits with anyone else who has access to the repository.

#### Usage
```bash
git push
```
This is will push any changes to the branch default remote repository which in this case will be Github.

### Pull
This command updates your local repository with any changes that have been made in the remote repository.

#### Usage
```bash
git pull
```
This will pull changes from the default remote repository.

### Branch
This can be used to create a new branch which allows you to work separately from just the default master branch.

#### Usage
```bash
git branch <name>
```
Creates a new branch with this name from the master branch.

### Checkout
This command is used to switch between branches.

#### Usage
```bash
git checkout <name>
```
This switches to the branch titled name.

### Merge
This merges the commits made in one branch with commits made in another branch.

#### Usage
```bash
git merge <branch>
```
Merges the selected branch into the branch that you are currently on.