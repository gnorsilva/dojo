/**
* A Directory is a tree structure consisting of leaves and nodes.
* In this implementation of directory, a node is called a directory 
* (short: dir) and a leaf is called a file. Directory offers the
* possibility to browse the tree structure using openDir and
* closeDir. The files and directories in a directory can be read
* using the methods getFiles and getDirs.
*/
public interface Directory {
	/**
	* Returns the files (leaves) in this directory. The files are
	* sorted in alphabetical order and no duplicates occur.
	* @return an array containing all the filenames in this directory
	*/
	public String[] getFiles();
	/**
	* Returns the directories (nodes, subdirectories) in this directory.
	* The files are sorted in alphabetical order and no duplicates
	* occur.
	* @return an array containing all the directory names in this
	* directory
	*/
	public String[] getDirs();
	/**
	* Opens a subdirectory by referring to its name
	* @param dirName the name of the subdirectory to be opened
	* @return the Directory opened
	* @throws DirectoryException is thrown when the directory name
	* (dirName) passed has no matching Directory
	*/
	public Directory openDir(final String dirName) throws DirectoryException;
	/**
	* Closes the current directory and returns the parent directory
	* @return the parent Directory
	* @throws DirectoryException is thrown when the parent directory
	* does not exist, in other words it is the root directory.
	*/
	public Directory closeDir() throws DirectoryException;
	/**
	* Returns the name of the directory
	* @return the name of the directory
	*/
	public String getName();
}
