package com.jungmin.script;

public class Part1 {
  /*
  ----------------------------------------------------------------------------------------------
      TODO: 유어클래스의 requirement를 참조하여, migration/schema.sql에 알맞은 테이블을 구성해주세요.
  */
/Users/vanessa/Desktop/code/git_practice/java-sql-practice-reference/src/main/java/com/jungmin/script/Part1.java
  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-1. 현재 있는 데이터베이스에 존재하는 모든 테이블 정보를 보기위한 SQL을 작성해주세요.
  */
  public static final String PART1_1 = "show tables";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-2. Users 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Users 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_2 = "DESC Users;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-3. Posts 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Posts 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_3 = "DESCRIBE posts";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-4. Tags 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Tags 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_4 = "DESCRIBE Tags";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-5. Post_Tags 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Post_Tags 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_5 = "DESCRIBE Post_Tags";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-6. Comments 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Comments 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_6 = "DESCRIBE Comments";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 1-7. Boards 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 Boards 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART1_7 = "DESCRIBE Boards";

}
