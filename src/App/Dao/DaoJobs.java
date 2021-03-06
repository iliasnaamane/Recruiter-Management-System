/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package App.Dao;

import OrmMapping.Jobs;
import java.util.List;

/**
 *
 * @author Ilias Naamane
 */

public class DaoJobs extends DaoAbstract {
    
    public DaoJobs() {
        super(Jobs.class);
    }
   
    public void create(Jobs j) {
        super.create(j);
    }
    
    @Override
    public List  getAll(){
      return super.getAll();    
    }
   
    public List findById(int id){
       return super.getHqlQuery("select j from Jobs j where id = "+id);
    }
   
    public List getRelevantJobsPourcentage(){      
       return super.getSqlQuery("select profil,count(*)/(select count(*) from Jobs) from Jobs group by profil order by 2 desc limit 0,5");
      
//return super.getQuery("select job.profil,count(*)  from Jobs job group by profil order by 2 desc") ;
    }
   
    public List getRelevantJobs(){ 
       return super.getSqlQuery("select profil,count(*) from Jobs group by profil order by 2 desc limit 0,5");
    }
   
    public List getCurrentJobs(){
       return super.getHqlQuery("from Jobs j where j.status <> -1");
    }
   
    public List getJobs() {
       return super.getHqlQuery("select j.id,j.profil,jc.name,j.status from Jobs j join j.clients jc  order by status desc , j.id desc ");
    }
    
    public void updateStatus(int idJob) {
       super.UpdateQuery("update Jobs set status = -1 where id ="+idJob);
    } 
    
    public List getJobsValidByClient(int idClient){
        return super.getHqlQuery("from Jobs j where j.clients.id= 1 and j.status = -1");
    }
    
}
