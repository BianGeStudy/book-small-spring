package cn.bugstack.springframework.jdbc.core;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 小傅哥，微信：fustack
 * @description Generic callback interface for code that operates on a JDBC Statement.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface StatementCallback<T> {

    T doInStatement(Statement statement) throws SQLException;

}
