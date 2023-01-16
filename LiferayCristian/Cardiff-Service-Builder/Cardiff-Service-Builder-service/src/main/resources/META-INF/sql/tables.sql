create table CardiffDB_cardiff (
	cardiffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	defaultLocale VARCHAR(75) null,
	taskExecutorClassName VARCHAR(75) null,
	name VARCHAR(75) null,
	backgroundTaskId LONG,
	permissionChecker VARCHAR(75) null,
	siteDefaultLocale VARCHAR(75) null,
	status LONG,
	themeDisplayLocale VARCHAR(75) null
);

create table Cardiff_cardiff (
	cardiffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	defaultLocale VARCHAR(75) null,
	taskExecutorClassName VARCHAR(75) null,
	name VARCHAR(75) null,
	backgroundTaskId LONG,
	permissionChecker VARCHAR(75) null,
	siteDefaultLocale VARCHAR(75) null,
	status LONG,
	themeDisplayLocale VARCHAR(75) null
);

create table FOO_cardiff (
	cardiffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	defaultLocale VARCHAR(75) null,
	taskExecutorClassName VARCHAR(75) null,
	name VARCHAR(75) null,
	backgroundTaskId LONG,
	permissionChecker VARCHAR(75) null,
	siteDefaultLocale VARCHAR(75) null,
	status LONG,
	themeDisplayLocale VARCHAR(75) null
);