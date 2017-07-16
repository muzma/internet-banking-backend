CREATE  TABLE rekening(
  id VARCHAR (36),
  nomer VARCHAR (100) not null,
  nama VARCHAR (255) not null,
  primary key (id),
  UNIQUE (nomer)
)