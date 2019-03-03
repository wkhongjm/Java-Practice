/****************************************************************************************
 *
 * 극장 예약 시스템
 *
 * -------------------------------
 *  1  2  3  4  5  6  7  8  9  10
 * -------------------------------
 *  0  0  0  0  0  0  0  0  0  0
 *  >> 원하시는 좌석번호를 입력하세요 (종료는 -1): [1]
 *  예약되었습니다.
 * -------------------------------
 *  1  2  3  4  5  6  7  8  9  10
 * -------------------------------
 *  1  0  0  0  0  0  0  0  0  0
 *  >> 원하시는 좌석번호를 입력하세요 (종료는 -1): [1]
 *  이미 예약된 자리입니다.
 */

// 1. 클래스 명: TheaterReserve
// 2. main 메소드
// 3. 변수
//    - seats: 10개의 배열 (0 혹은 1 저장)
//    - sNum: 원하는 좌석 번호
//    - input: Scanner 객체
// 4. 다음을 반복 (-1 이 입력될 때 까지)
//    1) 좌석 번호 출력
//    2) 예약 상태 출력
//    3) ">> 원하시는 좌석번호를 입력하세요 (종료는 -1): " 출력 및 입력
//    4) sNUM에 해당하는 seats가 0이면, 1로 바꾸고 "예약되었습니다." 출력
//    5) seats가 1이면, "이미 에약된 자리입니다. " 출력
//
