# Spotify Timer Playlist Algorithm
The algorithm for the Spotify Timer feature is very simple and quick. 

The files in this repository allow you to test the algorithm using a list of 100 songs.


## How The Algorithm Functions
1. Retrieve a list of songs, selected from either the user's saved library or a playlist of their selection. These songs will be referenced by their duration in milliseconds.
2. Shuffle / randomize the songs to prevent playlists from being the same.
3. Determine the total time for the playlist, given by the user upon playlist creation.
4. Starting with the first song in the list (index 0), the items are sequentially added until the sum of the songs is the same as the desired playlist time. There is a leniency of +/-1 second. While adding the songs, if the next song added causes the total sum to exceed the desired sum, the first item is removed and the sequence continues until the times are equal.

## Example
This times in this example are simplified. 

1. Start with a list of songs. The list is as follows:
```
Song A - 5 minutess in length
Song B - 7 minutes in length
Song C - 10 minutes in length
Song D - 3 minutes in length
Song E - 5 minutes in length
Song F - 10 minute in length
```

2. The song list is then shuffled, so the new order is: **C, A, E, D, B, F**
```
Song C - 10 minutes in length
Song A - 5 minutess in length
Song E - 5 minutes in length
Song D - 3 minutes in length
Song B - 7 minutes in length
Song F - 10 minute in length
```

3. The desired playlist time is taken from the user. In this example, it will be 25 minutes.

4. Each song is added until the desired playlist time is reached.
```
C(10m) + A(5m) = CA(15m)
CA(15m) + E(5m) = CAE(20m)
CAE(20m) + D(3m) = CAED(23m)
CAED(23m) + B(7m) = CAEDB(30m)
```
At this point, the sum of the songs added exceeds the desired playlist time, so the first item (Song C) is removed and the sequence continues.
```
AEDB(20m) + F(10m) = AEDBF(30m)
```
Again, the sum is greater than the desired playlist time, so the first item (Song A) is removed and the sequence continues.
```
EDBF(25m)
```
The total sum is equal to the desired playlist sum, so the addition stops and the playlist is created with the selected songs, Song E, Song D, Song B, and Song F.
