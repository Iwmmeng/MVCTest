//package com.email.test;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
///**
// * @author wangmeng
// * @date 18/11/20
// */
//public class RoeMapperTest {
//    private JdbcTemplate jt;
//    public void setJt(JdbcTemplate jt) {
//        this.jt = jt;
//    }
//    public List<TNpc> getAll(){
//        String sql = "select * from t_npc";
////使用
//        List list = jt.query(sql, new NpcRowMapper());
//        return list;
//    }
//    /**
//     * 定义内部类实现RowMapper接口
//     */
//    public class NpcRowMapper implements RowMapper {
//        //实现mapRow方法
//        @Override
//        public Object mapRow(ResultSet rs, int num) throws SQLException {
////对类进行封装
//            TNpc npc = new TNpc();
//            npc.setId(rs.getLong("id"));
//            npc.setName(rs.getString("name"));
//            return npc;
//        }
//    }
//}
//}
