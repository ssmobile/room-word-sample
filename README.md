# Room with a View

This is an application developed while covering a [Google codelab covering Architecture components](https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#13)

The application is using Room, a persistent library design to implement an abstraction layer over SQLite for storing key information on an internal database.

- The data architecture starts with an SQLite datasource, accessed via DAOs and Entity objects. 
- The Objects are then moved to a Repository, where all application data is sourced.
- From the repository, the UI accesses the repository using a ViewModel seamlessly, while LiveData (A lifecycle-aware holder class) is holding the data ensuring that any changes to the databases is properly reflected in the Views.
- There is a RecyclerView using an adapter to inflate the information onto the UI. The Recyclerview's Adapter is controlled by the ViewModel, such that whenever the data changes, the ViewModel can set the new information into the Adapter, which in turn updates the UI.`


Using this architecture, when a user enters a word in the second activity, the word enters the database using the Room library. In turn, the LiveData object is observing the repository. Once the repository has new information, the ViewModel notifies the RecyclerView's adatpter, and a new View is added onto the screen in the first Activity.


![](https://github.com/ssmobile/room-word-sample/blob/master/screenshots/before.png?raw=true)

![](https://github.com/ssmobile/room-word-sample/blob/master/screenshots/after.png?raw=true)
