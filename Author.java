class Author {
  String name;
  String gender;
  
  Author(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }
  
  // TEMPLATE
  /*   
   *    this.name
   *    this.gender
   * 
   */
  
  // Author -> boolean
  // Returns true if the name and gender of this Author
  // matches the name and gender of that Author
  boolean equals(Author that) {
    return this.name.equals(that.name) && this.gender.equals(that.gender);
  }
}