# be-springboot (가이드 미준수 샘플)
- 어긋남: 포트 3000 고정(BE-PORT) · DB URL 고정(BE-DB-URL) · 헬스 엔드포인트 없음(BE-HEALTH) · Dockerfile 없음(DOCKERFILE) · REST 경로 /api 아님(BE-API-PREFIX) · Java 17(BE-JAVA-VERSION) · .gitignore 에 .env 없음(GITIGNORE-ENV)
- 실행: `gradle bootRun`(Gradle·JDK 필요 · DB 없이는 기동 시 연결 실패) — 이 저장소 안에서 빌드는 검증하지 않았습니다.
- 용도: Arcus 가져오기(analyze_repo · preview_import) 시험용. 비밀값 없음.
