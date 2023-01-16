create index IX_9215D58 on Cardiff_cardiff (name[$COLUMN_LENGTH:75$]);
create index IX_4624F20D on Cardiff_cardiff (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E86C97CF on Cardiff_cardiff (uuid_[$COLUMN_LENGTH:75$], groupId);