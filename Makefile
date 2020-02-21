db:
	docker-compose up --no-recreate -d

logs:
	docker-compose logs

stop:
	docker-compose stop

prune:
	docker ps | awk '{print $1}' | xargs docker stop

flyway:
	docker-compose up flyway