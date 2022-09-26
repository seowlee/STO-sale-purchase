import axios from "axios";
import React, { useState, useContext, useEffect } from "react";
import { useParams } from "react-router-dom";
// import { DetailProductContext } from "./ListProductsSalePage";

const OrderPage = () => {
  const { goods_id } = useParams();
  // const { detailProduct } = useContext(DetailProductContext);
  const [detailProduct, setDetailProduct] = useState({
    goods_id: "",
    goods_nm: "",
    stat: 0,
  });

  // useEffect(() => {
  //   console.log("id : ", goods_id);
  //   fetch("http://localhost:8080/order/" + goods_id)
  //     .then((res) => res.json())
  //     .then((data) => {
  //       console.log("data : ", data);
  //       setDetailProduct(data);
  //     })
  //     .catch((error) => {
  //       console.log("에러", error);
  //     });
  // }, []);
  useEffect(() => {
    axios
      .get("/order/" + goods_id)
      .then((res) => {
        setDetailProduct(res.data);
        console.log("detailtest", res);
      })
      .catch((error) => {
        console.log("error", error);
      });
  }, []);

  console.log("param", goods_id);
  console.log("Success", detailProduct);

  return (
    <div>
      <div>{goods_id} 페이지</div>
      <h1>goods_nm : {detailProduct.goods_nm}</h1>
      <h1>total_amt : {detailProduct.total_amt}</h1>
      <h1>sale_amt : {detailProduct.sale_amt}</h1>
      <h1>ordr_fee : {detailProduct.ordr_fee}</h1>
      <h1>created_dt : {detailProduct.created_dt}</h1>
      <h1>created_by : {detailProduct.created_by}</h1>
    </div>
  );
};

export default OrderPage;
