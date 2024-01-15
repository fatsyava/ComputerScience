package com.vmelnyk.geeks4geeks.maximumMeetingsInOneRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
  public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
    // code here
    ArrayList<Meeting> meetings = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      meetings.add(new Meeting(i + 1, S[i], F[i]));
    }

    Collections.sort(meetings, Comparator.comparingInt(m -> m.finish));

    final ArrayList<Integer> meetingPositions = new ArrayList<>();
    int scheduleEndTime = -1;
    for (int i = 0; i < meetings.size(); i++) {
      final Meeting meeting = meetings.get(i);
      if (meeting.start > scheduleEndTime) {
        meetingPositions.add(meeting.position);
        scheduleEndTime = meeting.finish;
      }
    }

    Collections.sort(meetingPositions);

    return meetingPositions;
  }
}

class Meeting {
  int position;
  int start;
  int finish;

  Meeting(int pos, int start, int finish) {
    this.position = pos;
    this.start = start;
    this.finish = finish;
  }

  @Override
  public String toString() {
    return position + ", [" + start + "-" + finish + ']';
  }
}
