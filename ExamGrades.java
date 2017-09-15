class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  // DONE design a function that returns the highest grade
  
  /* -> double
   * Returns the highest grade given an array of grades.
   */
  
  /* Template
   *   Fields:
   *     ... this.grades ...
   */
  
  double highestGrade() {
    double highest = 0.0;
    for (int i = 0; i < grades.length; i++) {
      if (highest < grades[i]) {
        highest = grades[i];
      }
    }
    return highest;
  } 
}